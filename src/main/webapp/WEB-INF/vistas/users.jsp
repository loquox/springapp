<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Productos</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
</head>
</head>
<h1>Listado de Productos</h1>
<body>

<div class="container">
	<div class="row">
		<p>
			<button class="btn btn-primary">
  				<i class="fas fa-plus"></i> Agregar
			</button>
				
		</p>	
	
	</div>



</div>


<table>
	<tr>
		<th style="width: 50px">Nombre</th>
		<th style="width: 50px">Correo</th>
		<th style="width: 50px">telefono</th>

	</tr>
	<c:forEach var="user" items="${listUsers}" varStatus="status">


		<tr>
			<td><b>${status.index + 1}</b></td>
			<td>${user.nombre}</td>
			<td>${user.correo}</td>
			<td>${user.telefono}</td>
		</tr>


	</c:forEach>

</table>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
</body>

</html>