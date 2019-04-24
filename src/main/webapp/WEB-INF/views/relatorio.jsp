<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />


<div class="card text-center">
    <div class="card-header">
        <h1 align="center">Relatório</h1>
    </div>
    <div class="card-body text-left">        
        <table class="table">
            <tr>
                <th>Sede</th>
                <th>Total</th>
            </tr>
            <c:forEach items="${relatorio}" var="rep">
                <tr>
                    <td>${rep.getNome_fantasia()}</td>
                    <td>${rep.totalHoras()} <i class="far fa-clock"></i></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div class="card-footer text-muted text-right">
        Relatório
    </div>
</div>

<c:import url="/WEB-INF/views/rodape.jsp" />