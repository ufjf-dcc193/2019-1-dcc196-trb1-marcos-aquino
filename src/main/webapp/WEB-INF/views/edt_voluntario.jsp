<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div>
    <div>
        <h1 align="left">Voluntários</h1>
    </div>
    <div>
        <form class="text-left" action="cadastrar_voluntario.html" method="POST">
            <input type="hidden" name="id" value="${voluntario.getId()}">
            <label>Sede:</label>
            <select name="sede" class="form-control form-group" value="${voluntario.getSede().getNome_fantasia()}">                
                <c:forEach var="rep" items="${sede}">
                    <option value="${rep.getId()}">
                        ${rep.getNome_fantasia()}
                    </option>
                </c:forEach>
            </select>
            <label>Nome:</label>
            <input type="text" name="nome" class="form-control form-group" value="${voluntario.getNome()}">
            <label>Função:</label>
            <input type="text" name="funcao" class="form-control form-group" value="${voluntario.getFuncao()}">
            <label>Email:</label>
            <input type="email" name="email" type="text" class="form-control form-group" value="${voluntario.getEmail()}">
            <label>Data entrada:</label>
            <input name="data_entrada" type="text" class="form-control form-group datepicker" value="${voluntario.getData_entrada()}">
            <label>Data saída:</label>
            <input name="data_saida" type="text" class="form-control form-group datepicker" value="${voluntario.getData_saida()}">
            <div class="text-right"><br />
                <button type="submit" class="btn btn-outline-primary">OK</button>
                <a class="btn btn-outline-danger" href="voluntario.html">Cancelar</a>
            </div>
        </form>
    </div>
    <div class="card-footer text-muted text-right">
        Voluntários
    </div>
</div>

<c:import url="/WEB-INF/views/rodape.jsp" />