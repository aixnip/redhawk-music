<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Look up orders";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>

<%-- Begin Content --%>
<div class="list">
    <p>If you are not a RedHawk Music member. Please enter your order ID below to view the past orders. Members please log in and go to your music list.</p>
	<form action="order-lookup-list.jsp" method="get">
    <ul class="user">
		<li>Order ID<br><input type="text" name="orderID"></td></li>
		<li><input type="submit" value="Get Order Detail"></li>
    </form>
</div>
<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>