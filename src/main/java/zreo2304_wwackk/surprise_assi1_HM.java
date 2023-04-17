package zreo2304_wwackk;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class surprise_assi1_HM {
    public static void main(String[] args) {
        

        try {
        	// 인덱스 file 저장 
            File file = new File("property.html");
            // writer라는 BufferedWriter 스트림 생성  
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            // HTML code 작성하기 
            writer.write("<!DOCTYPE html>\n");
            writer.write("<html>\n");
            writer.write("<head>\n");
            writer.write("<meta charset=\"UTF>\">\n"); //이스케이 문자 백슬래시(\) 
            writer.write("<title>Insert title here</title>\n");
	            writer.write("<style>\n"); // style태그 추가(샘플 코드 참조)
	            writer.write("table {border-collapse: collapse; width: 100%; }\n");
	            writer.write("th, td { border: solid 1px #000; }\n");
	            writer.write("</style>\n");
            writer.write("</head>\n");
            
            writer.write("<body>\n");
            writer.write("<h1>자바 환경 정보</h1>\n");
            writer.write("<table>\n");
            writer.write("<tr><th>키</th><th>속성</th></tr>\n");

            // 자바 시스템 속성 출력 예
            for (Object k : System.getProperties().keySet()) {
                String key = k.toString();
                String value = System.getProperty(key);
                writer.write("<tr><td>" + key + "</td><td>" + value + "</td></tr>\n");
            }

            writer.write("</table>\n");
            writer.write("</body>\n");
            writer.write("</html>\n");

            // writer 스트림 닫기 
            writer.close();
            
            System.out.println("실행이 잘 되었습니다."); //실행 진행 확인 


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}