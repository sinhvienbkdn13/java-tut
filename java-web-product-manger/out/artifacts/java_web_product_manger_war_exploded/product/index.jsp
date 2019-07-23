<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 7/23/2019
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
        <th scope="col">Description</th>
        <th scope="col">Producer</th>
        <th scope="col">
            <span style="margin-right: 10%">Setting</span>
            <button type="button" class="btn btn-primary" aria-label="Left Align" data-toggle="modal"
                    data-target="#createProduct">
                Create New Product
            </button></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="product">
        <tr>
            <th scope="row">${product.id}</th>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td>${product.producer}</td>
            <td>
                <a role="button" class="btn btn-success" aria-label="Left Align"
                   href="/?action=view&productId=${product.id}">
                    <i class="material-icons"> remove_red_eye </i>
                </a>
                <a role="button" class="btn btn-warning" aria-label="Left Align"
                   href="/?action=edit&productId=${product.id}">
                    <i class="material-icons"> edit </i>
                </a>
                <a role="button" class="btn btn-danger" aria-label="Left Align"
                   href="/?action=delete&productId=${product.id}">
                    <i class="material-icons"> delete </i>
                </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<!-- create product-->
<div class="modal fade" id="createProduct" tabindex="-1" role="dialog" aria-labelledby="createProductTitle"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="createProductTitle">Create New Product</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="name">Name </label>
                        <input type="text" class="form-control" id="name" name="name" placeholder="Enter name product">
                    </div>
                    <div class="form-group">
                        <label for="description">Description </label>
                        <textarea class="form-control" id="description" name="description" rows="3"
                                  placeholder="Enter description product"></textarea>
                    </div>
                    <div class="form-group">
                        <label for="price">Price</label>
                        <input type="text" class="form-control" id="price" name="price"
                               placeholder="Enter price product">
                    </div>

                    <div class="form-group">
                        <label for="producer">Producer</label>
                        <input type="text" class="form-control" id="producer" name="producer"
                               placeholder="Enter producer product">
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" id="btnCreateProduct">Add Product</button>
            </div>
        </div>
    </div>
</div>


<script src="https://use.fontawesome.com/c38e11a60d.js"></script>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<script>
    $(function () {
        $("#btnCreateProduct").on('click', function () {
            var name = $("#name").val();
            var description = $("#description").val();
            var price = $("#price").val();
            var producer = $("#producer").val();
            window.location.href = "/?action=create&name=" + name + "&description=" + description + "&price=" + price + "&producer=" + producer;
        });
    });
</script>
</body>
</html>



