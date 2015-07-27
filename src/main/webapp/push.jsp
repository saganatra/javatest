<%@page import="com.aws.wwps.demo.MessageProcessor"%>  
<jsp:useBean id="obj" class="com.aws.wwps.demo.Message"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
	int status=MessageProcessor.push();  
	if(status > 0)  
		out.print("Message sent."); 
	else
		out.print("There was a problem!"); 
%>  