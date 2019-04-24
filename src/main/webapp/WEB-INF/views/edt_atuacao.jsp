<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div>
    <div>
        <h1 align="center">Atuação</h1>
    </div>
    <div>
        <form action="atuacao_alterar.html" method="POST">
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

            <div class="text-right"><br />
                <button type="submit" class="btn btn-primary btm-sm">Cadastrar</button>
                <a class="btn btn-danger" href="atuacao.html">Cancelar</a>
            </div>
        </form>
    </div>

</div>

<c:import url="/WEB-INF/views/rodape.jsp" />