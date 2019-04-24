<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div class="card text-center">
    <div class="card-header">
        <h1 align="center">Voluntários</h1>
    </div>
    <div class="card-body text-left">
        <form class="text-left" action="cadastrar_voluntario.html" method="POST">
            <label>Sede:</label>
            <select name="sede" class="form-control form-group">
                <option value="">...</option>
                <c:forEach var="rep" items="${sede}">
                    <option value="${rep.id}">
                        ${rep.getNome_fantasia()}
                    </option>
                </c:forEach>
            </select>
            <label>Nome:</label>
            <input type="text" name="nome" class="form-control form-group">
            <label>Função:</label>
            <input type="text" name="funcao" class="form-control form-group">
            <label>Email:</label>
            <input type="email" name="email" type="text" class="form-control form-group">
            <label>Data entrada:</label>
            <input name="data_entrada" type="text" class="form-control form-group datepicker">
            <label>Data saída:</label>
            <input name="data_saida" type="text" class="form-control form-group datepicker">
            <div class="text-right"><br />
                <button type="submit" class="btn btn-primary btm-sm">OK</button>
                <a class="btn btn-danger" href="voluntario.html">Cancelar</a>
            </div>
        </form>
    </div>
    <div class="card-footer text-muted text-right">
        Voluntários
    </div>
</div>

<c:import url="/WEB-INF/views/rodape.jsp" />