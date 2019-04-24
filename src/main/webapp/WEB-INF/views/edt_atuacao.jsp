<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div class="card text-center">
    <div class="card-header">
        <h1 align="center">Atuação</h1>
    </div>
    <div class="card-body text-left">
        <form class="text-left" action="atuacao_alterar.html" method="POST">
            <input type="hidden" name="id" value="${atuacao.getId()}">
            <label>Sede:</label>
            <select name="sede" class="form-control form-group" value="${atuacao.getSede().getNome_fantasia()}" >                
                <c:forEach var="rep" items="${sede}">
                    <option value="${rep.getId()}" value="${atuacao.getSede().getNome_fantasia()}">
                        ${rep.getNome_fantasia()}
                    </option>
                </c:forEach>
            </select>
            <label>Título:</label>
            <input type="text" name="titulo" class="form-control form-group" value="${atuacao.getTitulo()}">
            <label>Descrição:</label>
            <input type="text" name="descricao" class="form-control form-group" value="${atuacao.getDescricao()}">
            <!--<label>Hora Assistencial:</label>
            <input type="number" name="hora_assistencial" class="form-control form-group" value="${atuacao.getHora_assistencial()}">
            <label>Hora Jurídica:</label>
            <input type="number" name="hora_juridica" class="form-control form-group" value="${atuacao.getHora_juridica()}">
            <label>Hora Executiva:</label>
            <input type="number" name="hora_executiva" class="form-control form-group" value="${atuacao.getHora_executiva()}">
            <label>Hora Financeira:</label>
            <input type="number" name="hora_financeira" class="form-control form-group" value="${atuacao.getHora_financeira()}">
            <label>Data início:</label>
            <input name="data_inicio" type="text" class="form-control form-group datepicker" value="${atuacao.getData_inicio()}">
            <label>Data fim:</label>
            <input name="data_fim" type="text" class="form-control form-group datepicker" value="${atuacao.getData_fim()}"> -->
            <div class="text-right"><br />
                <button type="submit" class="btn btn-primary btm-sm">OK</button>
                <a class="btn btn-danger" href="atuacao.html">Cancelar</a>
            </div>
        </form>
    </div>
    <div class="card-footer text-muted text-right">
        Atuações
    </div>
</div>

<c:import url="/WEB-INF/views/rodape.jsp" />