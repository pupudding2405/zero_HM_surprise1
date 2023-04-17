package zreo2304_wwackk;


import java.util.ArrayList;
import java.util.Scanner;

public class surprise_assi2_HM {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // 나의 좌표 값을 입력 받음
        System.out.print("나의 좌표(x, y)를 각각 하나씩 입력하세요: ");
        int myX = scanner.nextInt();
        int myY = scanner.nextInt();
        
        ArrayList<int[]> coordinates = new ArrayList<int[]>();
        
        // 임의의 좌표값을 10개 입력 받음
        for (int i = 0; i < 10; i++) {
            System.out.print("좌표 " + (i + 1) + "(x, y)를 각각 하나씩 입력하세요: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            // 중복된 좌표 체크
            boolean isDuplicate = false;
            for (int[] coordinate : coordinates) {
                if (coordinate[0] == x && coordinate[1] == y) {
                    System.out.println("중복된 좌표입니다. 다시 입력하세요.");
                    isDuplicate = true;
                    break;
                }
            }
            // 중복되지 않은 경우 리스트에 추가
            if (!isDuplicate) {
                    coordinates.add(new int[] {x, y});
            }
        }  
        
        // 나의 좌표와 가장 가까운 좌표값을 찾음
        int[] closestCoordinate = coordinates.get(0);
    	int minDistance = calculateDistance(new int[]{myX, myY}, closestCoordinate);
    	//좌표와 배열 간의 거리를 계산한 결과를 minDistance에 할당

    	for (int i = 1; i < coordinates.size(); i++) {
    	int[] currentCoordinate = coordinates.get(i);
    	int currentDistance = calculateDistance(new int[]{myX, myY}, currentCoordinate);
    	
    		if (currentDistance < minDistance) {
    			closestCoordinate = currentCoordinate;//closestCoor 배열을 currentCoor 배열로 교체
    			minDistance = currentDistance;//minDist 값을 currentDist 값으로 업데이트
    		}
    	}	
            
        System.out.println("가장 가까운 좌표: (" + closestCoordinate[0] + ", " + closestCoordinate[1] + ")");
	           
            
      
	}
	// calculateDistance 매서드 정의 : 두 개의 좌표(배열로 표현)를 받아서 그 사이의 거리(distance)를 계산
	public static int calculateDistance(int[] point1, int[] point2) {
		int xDistance = point2[0] - point1[0]; // 두 좌표의 x, y 축 각각의 거리를 계산
		int yDistance = point2[1] - point1[1];
		int distance = (int) Math.sqrt(xDistance * xDistance + yDistance * yDistance);
		return distance; // 피타고라스 정리로 계산된 거리 값을 반환
		}

}
