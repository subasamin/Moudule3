<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10/9/24
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap demo</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
<body>
<center><h1>Mượn sách</h1></center>
<form action="/books?action=borrowBook" method="post">
    <div class="mb-3">
        <label  class="form-label">Mã mượn sách</label>
        <input type="text" class="form-control" id="id">
    </div>
    <div class="mb-3">
        <label  class="form-label">Tên sách</label>
        <input type="text" class="form-control" id="name">
    </div>
    <div class="mb-3">
        <label  class="form-label">Tên học sinh</label>
        <input type="text" class="form-control" id="student">
    </div>
    <div class="mb-3">
        <label  class="form-label">Ngày mượn</label>
        <input type="text" class="form-control" id="borrowday">
    </div>
    <div class="mb-3">
        <label  class="form-label">Ngày trả</label>
        <input type="text" class="form-control" id="returnday">
    </div>
    <button type="submit" class="btn btn-primary">Mượn</button>
    <button type="reset" class="btn btn-primary">Huỷ</button>
</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</html>
