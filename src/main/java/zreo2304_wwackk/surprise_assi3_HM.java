package zreo2304_wwackk;

public class surprise_assi3_HM {
	public class PageNavigation {
	    private int totalPosts; // 전체 게시글 수
	    private int postsPerPage = 10; // 한 페이지당 보여지는 글의 수
	    private int blocksPerPage = 10; // 페이지 네비게이션에서 보여주는 블록 수
	    private int currentPage; // 현재 페이지 번호

	    public PageNavigation(int totalPosts, int currentPage) {
	        this.totalPosts = totalPosts;
	        this.currentPage = currentPage;
	    }
	    public String getPageNavigation() {
	        StringBuilder sb = new StringBuilder();
	        //StringBuilder 클래스의 객체를 생성하여 문자열을 추가 (StringBuilder 클래스의 append 메서드를 사용하여 이전, 다음 페이지
	        
	        int totalPages = (int) Math.ceil((double) totalPosts / postsPerPage); // 전체 페이지 수
	        // Math 클래스의 ceil메서드를 사용하여 전체 페이지 수(totalPages)를 소수점 이하를 올림한 정수 값으로 변환
	        
	        // 현재 페이지가 속한 블록의 시작 페이지와 끝 페이지 계산
	        int currentBlock = (int) Math.ceil((double) currentPage / blocksPerPage);
	        int startPage = (currentBlock - 1) * blocksPerPage + 1;
	        int endPage = Math.min(startPage + blocksPerPage - 1, totalPages);
	        
	        sb.append("<a href='#'>").append("[처음]").append("</a>\n");
            sb.append("<a href='#'>").append("[이전]").append("</a>\n").append("\n");

	        // 페이지 링크
	        for (int i = startPage; i <= endPage; i++) {
	            if (i == currentPage) {
	                sb.append("<a href='#' class='on'>").append(i).append("</a>\n");
	            } else {
	                sb.append("<a href='#'>").append(i).append("</a>\n");
	            }
	        }

	        sb.append("\n");
	        sb.append("<a href='#'>").append("[다음]").append("</a>\n");
            sb.append("<a href='#'>").append("[마지막]").append("</a>\n");

	        return sb.toString();
	    }
	}
	
	public static void main(String[] args) {
		int totalCount = 127; // 전체 게시글 수 = totalPosts
	    int pageIndex = 2; // 현재 페이지 번호 = currentPage
	    // 외부 클래스의 인스턴스를 먼저 생성
		surprise_assi3_HM instance = new surprise_assi3_HM();
		// 내부 클래스의 인스턴스 생성 시, 외부 클래스의 인스턴스를 전달
		PageNavigation pageNavigation = instance.new PageNavigation(totalCount, pageIndex);
	    
		String pageNavigationHtml = pageNavigation.getPageNavigation();
	    System.out.println(pageNavigationHtml);
	}
}
