<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<spring:url value="/" var="baseurl"></spring:url>
<spring:url value="/img" var="img_url" />
<spring:url value="/style" var="style_url" />
<spring:url value="/css" var="css_url" />
<link rel="stylesheet" type="text/css" href="${css_url}/setting.css">

<div id="content_wrapper">
	<div id="side_bar">

		<div id="sidebar_news_area"></div>
	</div>
	<div id="content">





		<div id="content-header">
			<img alt="Show_settings" src="${img_url}/fee_slip.jpg"
				style="width: 50px;">
			<h1>Search Fee Slip</h1>
			<h3>search fee slip</h3>
			<div id="app-back-button">
			<a href="home"><img alt="Back" border="0"
				src="${img_url}/home.png"
				style="margin-top: -6px; height: 40px; width: 40px;"></a> <a
				href="#" onclick="javascript:location.reload(true);"><img
				alt="Back" border="0" src="${img_url}/refresh.png"
				style="margin-top: -6px; height: 40px; width: 40px;"></a> <a
				href="#" onclick="history.back(); return false;"><img alt="Back"
				border="0" src="${img_url}/back.png"
				style="margin-top: -6px; height: 40px; width: 40px;"></a>
		</div>
		</div>

		<div id="page-yield">



			<div id="box">


				<div class="link-box">
					<div class="link-heading">
						<a href="search-by-slip-no.html">Search By Slip-No</a>
					</div>
					<div class="link-descr">search by slip-no.</div>
				</div>



				<div class="link-box">
					<div class="link-heading">
						<a href="search-by-student-name.html">Search By Student-Name</a>
					</div>
					<div class="link-descr">search by student-name.</div>
				</div>


				<div class="link-box">
					<div class="link-heading">
						<a href="search-by-date.html">Search By Slip-Date</a>
					</div>
					<div class="link-descr">search by slip-date.</div>
				</div>


				<div class="link-box">
					<div class="link-heading">
						<a href="search-by-admission.html">Search By Admission-No</a>
					</div>
					<div class="link-descr">search by admission-no.</div>
				</div>
			</div>


		</div>
	</div>

	<div class="extender"></div>
</div>