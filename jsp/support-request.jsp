<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Support Request";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>

<%-- Begin Content --%>
<div class="list">
<form action="support-request-result.jsp" method="get">
    <h2>Support Request</h2>
	<div id="message">
    <p>Trouble logging in? Downloading problem? Question about our service? Please fill out the form below!</p>
    <p>Email support requests will be processed before the close of the following business day.</p>
    <p>For immediate assistance please call our 24x7 toll-free support line: 888-595-1234</p>
</div>
        <form method="POST">
          <ul class="user">
		  <li>Name:
              <input name="s_name" id="s_name" value="" maxlength="20" size="30" type="text">
		  </li>
          <li>Email:
              <input name="s_email" id="s_email" value="" maxlength="40" size="30" type="text">
			  <small>Invalid Email addresses are treated as spam!</small>
			   </li>
          <li>Phone:
              <input name="s_phone" id="s_phone" value="" maxlength="15" size="30" type="text">
              <small>Please provide a number where we can call you back.</small>
  			  <input name="s_location" id="s_location" value="IIT CS595" maxlength="30" size="30" type="hidden">  
		  </li>
           <li>Username:
              <input name="s_username" id="s_username" value="" maxlength="20" size="30" type="text">
              <small>Please enter 'None' if you don't have an account.</small>
            </li>
            
            <li>Preferred method of contact:
              <select name="s_contactmethod" id="s_contactmethod" class="#">
              <option value="" selected="">Please Select</option>
              <option value="Email">Email</option>
              <option value="Phone">Phone</option>
              </select>
		  </li>
              <li>Request Type:<select id="SSel" name="SSel" style="font-family: Verdana" dir="ltr" class="#"><option value="N/A">Please Select</option>
			  <option value="Account Question">Account Question</option>
			  <option value="101">Streaming Problem</option>
			  <option value="Streaming Problem">Downloading Problem</option>
			  <option value="Credit Card Issue">Credit Card Issue</option>
			  <option value="Email Problem">Email Problem</option>
			  <option value="Request Release New Songs">Request Newly Released Songs</option>
			  <option value="Other">Other</option>
			  <option value="Suggestion">Suggestion</option>
			  </select>
		  </li>
             
            <li>Additional Info:<br>
				<textarea name="s_comments" rows="10" cols="50" ></textarea>
              </li>
            <li><input value="Submit" name="submit" type="submit"></li>
            
	  </ul>
       
</form>
</div>

<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>