<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div class="card text-center">
    <div class="card-header">
        <h1 align="center">Atuação</h1>
    </div>
    <div class="card-body text-left">
        <a class="btn btn-primary btn-sm" href="atividade_form.html" role="button"><i class="fa fa-plus"
                aria-hidden="true"></i>
        </a><br /><br />

        <table class="table">
            <tr>
                <th>Sede</th>
                <th>Título</th>
                <th>Descrição</th>
                <th>Data Início</th>
                <th>Data Fim</th>
                <th>Assistencial</th>
                <th>Jurídica</th>
                <th>Executiva</th>
                <th>Financeira</th>
                <th>Ações</th>
            </tr>
            <c:forEach items="${atividade}" var="rep">
                <tr>
                    <td>${rep.getSede().getNome_fantasia()}</td>
                    <td>${rep.getTitulo()}</td>
                    <td>${rep.getDescricao()}</td>
                    <td>${rep.getData_inicio()}</td>
                    <td>${rep.getData_fim()}</td>                                     
                    <td>${rep.getHora_assistencial()} <i class="far fa-clock"></i></td>                                     
                    <td>${rep.getHora_juridica()} <i class="far fa-clock"></i></td>                                     
                    <td>${rep.getHora_executiva()} <i class="far fa-clock"></i></td>                                     
                    <td>${rep.getHora_financeira()} <i class="far fa-clock"></i></td>                                     
                    <td>
                        <form method="POST" action="atividade_editar.html">
                            <input type="hidden" name="id" value="${rep.getId()}">
                            <button type="submit" class="btn btn-info btn-sm"><i class="far fa-edit"></i></button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div class="card-footer text-muted text-right">
        Atuações
    </div>
</div>

<c:import url="/WEB-INF/views/rodape.jsp" />