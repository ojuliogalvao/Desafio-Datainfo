<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TelaCadastro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous"></head>
<body>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8" crossorigin="anonymous"></script>

<form>
<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Nome</label>
    <input type="name" class="form-control" id="exampleInputEmail1" aria-describedby="nameHelp">
    
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Senha</label>
    <input type="password" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="mb-3">
    <label for="exampleInputTelefone" class="form-label">Telefone</label>
    <input type="telefone" class="form-control" id="exampleInputTelefone" aria-describedby="telefoneHelp">
    
  </div>
  <button type="cadastrar" class="btn btn-primary">Cadastrar</button>
  <button type="consultar" class="btn btn-primary">Consultar</button>
  <button type="excluir" class="btn btn-primary">Excluir</button>
</form>
</body>
</html>