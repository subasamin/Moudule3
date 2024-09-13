<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách sách</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>Danh sách sách trong thư viện</h2>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Mã sách</th>
            <th>Tên sách</th>
            <th>Tác giả</th>
            <th>Mô tả</th>
            <th>Số lượng</th>
            <th>Thao tác</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${listBook}">
            <tr>
                <td>${book.idBook}</td>
                <td>${book.nameBook}</td>
                <td>${book.author}</td>
                <td>${book.quantity}</td>
                <td>${book.describee}</td>
                <td>
                    <c:choose>
                        <c:when test="${book.quantity > 0}">
                            <a href="books?borrowBook=${book.idBook}" class="btn btn-primary">Mượn sách</a>
                        </c:when>
                        <c:otherwise>
                            <button class="btn btn-secondary" disabled>Hết sách</button>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
