<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div>
    <div>
        <h1 align="center">Atuações</h1>
    </div>
    <div >
        <form class="text-left" action="cadastrar_atuacao.html" method="POST">
            <label>Sede:</label>
            <select name="sede" class="form-control form-group">
                <option value="">...</option>
                <c:forEach var="rep" items="${sede}">
                    <option value="${rep.getId()}">
                        ${rep.getNome_fantasia()}
                    </option>
                </c:forEach>
            </select>
            <label>Título:</label>
            <input type="text" name="titulo" class="form-control form-group">
            <label>Descrição:</label>
            <input type="text" name="descricao" class="form-control form-group">
            <label>Hora Assistencial:</label>
           <!-- <input type="number" name="hora_assistencial" class="form-control form-group">
            <label>Hora Jurídica:</label>
            <input type="number" name="hora_juridica" class="form-control form-group">
            <label>Hora Executiva:</label>
            <input type="number" name="hora_executiva" class="form-control form-group">
            <label>Hora Financeira:</label>
            <input type="number" name="hora_financeira" class="form-control form-group">
            <label>Data início:</label>
            <input name="data_inicio" type="text" class="form-control form-group datepicker">
            <label>Data fim:</label>
            <input name="data_fim" type="text" class="form-control form-group datepicker">  -->
            <div class="text-right"><br />
                <button type="submit" class="btn btn-primary btm-sm">OK</button>
                <a class="btn btn-danger" href="atuacao.html">Cancelar</a>
            </div>
        </form>
    </div>

</div>

<c:import url="/WEB-INF/views/rodape.jsp" />