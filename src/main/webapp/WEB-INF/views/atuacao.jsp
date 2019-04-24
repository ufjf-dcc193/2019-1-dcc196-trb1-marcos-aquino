<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div>
    <div>
        <h1>Atuação</h1>
    </div>
    <div>
        <a href="form_atuacao.html" role="button">Adicionar</a><br /><br />

        <table class="table">
                <thead class="thead-dark">
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
            <c:forEach items="${atuacao}" var="rep">
                <tr>
                    <td>${rep.getSede().getNome_fantasia()}</td>
                    <td>${rep.getTitulo()}</td>
                    <td>${rep.getDescricao()}</td>
                    <td>${rep.getData_inicio()}</td>
                    <td>${rep.getData_fim()}</td>                                     
                    <td>${rep.getHora_assistencial()}</td>                                     
                    <td>${rep.getHora_juridica()}</td>                                     
                    <td>${rep.getHora_executiva()}</td>                                     
                    <td>${rep.getHora_financeira()}</td>                                
                    <td>
                        <form method="POST" action="edt_atuacao.html">
                            <input type="hidden" name="id" value="${rep.getId()}">
                            <button type="submit" class="btn btn-outline-primary">Editar</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>

    <img src="/img/banner.jpg" class="img-fluid" alt="Imagem responsiva">

</div>

<c:import url="/WEB-INF/views/rodape.jsp" />