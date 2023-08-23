<%@page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>

<div class="container">
	<div class="row">
        <div class="col-4">
            <h2>Introduce</h2>
            <h6>Name : Nguyễn Thế Quang Thắng</h6>
            <h6>Trường : Đại Học Công Nghiệp Hà Nội</h6>
            <h6>Chuyên Ngành: Công Nghệ Kĩ Thuật Máy Tính</h6>
            <h6></h6>
        </div>

        <div class="col-4">
            <h2>Skill</h2>
            <h6>Spring boot</h6>
            <h6>Servlet/JSP</h6>
            <h6>Java swing</h6>
            <h6>SQL server</h6>
            <h6>Java core</h6>
        </div>
        
        <div class="col-4">
        	<h2>Contact</h2>
        	<div class="row mb-4">
        		<i onclick="git()" style="font-size: 30px;" class="fa-brands fa-github col-2"></i>
        		<i onclick="face()" style="font-size: 30px;" class="fa-brands fa-facebook col-2"></i>
        		<a href="https://www.facebook.com/quangthang090009" class="col-2">CV</a>
        	</div>
        	<div class="mb-4">
        		<i style="font-size: 20px" class="fa-solid fa-phone"></i>  : 0866074707
        	</div>
        	
        	<div class="mb-4">
        		<i class="fa-solid fa-envelope"></i>  : nguyenthequangthang2410@gmail.com
        	</div>
        	
        </div>

        
    </div>
</div>
<script type="text/javascript">
	function face() {
		window.open("https://www.facebook.com/quangthang090009", "FaceBook");
	}
	
	function git() {
		window.open("", "Github");
	}
</script>