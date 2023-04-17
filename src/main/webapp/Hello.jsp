
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hyunmu_surprise1</title>

	<style>
		table {border-collapse: collapse; width: 100%; }
		th, td { border: solid 1px #000; }
	</style>
</head>
<body>


<%
	//System.out.println("hihi HM");
	//out.println(java.time.LocalDateTime.now());
	//out.print("Hi22 HM");
	out.write("<h1>자바 환경 정보</h1>");
	
	

	
	     // Write HTML code
	     out.write("<!DOCTYPE html>\n");
	     out.write("<html>\n");
	     out.write("<head>\n");
	     out.write("<style>\n");
	     out.write("table, th, td {\n");
	     out.write("  border: 1px solid black;\n");
	     out.write("  border-collapse: collapse;\n");
	     out.write("}\n");
	     out.write("</style>\n");
	     out.write("</head>\n");
	     out.write("<body>\n");
	     out.write("<table>\n");
	     out.write("<tr><th>키</th><th>속성</th></tr>\n");

     // Write system properties to table
     for (Object k : System.getProperties().keySet()) {
         String key = k.toString();
         String value = System.getProperty(key);
         out.write("<tr><td>" + key + "</td><td>" + value + "</td></tr>\n");
     }

     out.write("</table>\n");
     out.write("</body>\n");
     out.write("</html>\n");

     // Close writer
     out.close();
	

%>

</body>
</html>