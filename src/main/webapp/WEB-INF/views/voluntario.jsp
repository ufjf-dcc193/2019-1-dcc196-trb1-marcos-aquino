<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div class="card text-center">
    <div class="card-header">
        <h1 align="center">Voluntários</h1>
    </div>
    <div class="card-body text-left">
        <a class="btn btn-primary btn-sm" href="form_voluntario.html" role="button"><i class="fa fa-plus"
                aria-hidden="true"></i>
        </a><br /><br />

        <table class="table">
            <tr>
                <th>Sede</th>
                <th>Nome</th>
                <th>Função</th>
                <th>E-mail</th>
                <th>Data Entrada</th>
                <th>Data Saída</th>
                <th>Ações</th>
            </tr>
            <c:forEach items="${voluntario}" var="rep">
                <tr>
                    <td>${rep.getSede().getNome_fantasia()}</td>
                    <td>${rep.getNome()}</td>
                    <td>${rep.getFuncao()}</td>
                    <td>${rep.getEmail()}</td>
                    <td>${rep.getData_entrada()}</td>
                    <td>${rep.getData_saida()}</td>                    
                    <td>
                        <form method="POST" action="edt_voluntario.html">
                            <input type="hidden" name="id" value="${rep.getId()}">
                            <button type="submit" class="btn btn-info btn-sm"><i class="far fa-edit"></i></button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
            
        </table>
    </div>

</div>

<c:import url="/WEB-INF/views/rodape.jsp" />