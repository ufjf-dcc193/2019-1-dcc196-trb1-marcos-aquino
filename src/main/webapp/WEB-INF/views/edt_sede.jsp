<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />
<div>
    <div>
        <h1 align="center">Sedes</h1>
    </div>
    <div>
        <form class="text-left" action="cadastrar_sede.html" method="POST">
            <input type="hidden" name="id" value="${sede.getId()}">
            <label>Nome:</label>
            <input type="text" name="nome_fantasia" class="form-control form-group" value="${sede.getNome_fantasia()}">
            <label>Endereço:</label>
            <input type="text" name="endereco" class="form-control form-group" value="${sede.getEndereco()}">
            <label>Cidade:</label>
            <input name="cidade" type="text" class="form-control form-group" value="${sede.getCidade()}">
            <label>Bairro:</label>
            <input name="bairro" type="text" class="form-control form-group" value="${sede.getBairro()}">
            <label>Estado:</label>            
            <input name="estado" type="text" class="form-control form-group" value="${sede.getEstado()}">
            <label>Telefone:</label>
            <input name="telefone" type="text" class="form-control form-group" value="${sede.getTelefone()}">
            <div class="text-right"><br />
                <button type="submit" class="btn btn-outline-primary">OK</button>
                <a class="btn btn-outline-danger" href="sede.html">Cancelar</a>
            </div>
        </form>
    </div>

</div>
<c:import url="/WEB-INF/views/rodape.jsp" />