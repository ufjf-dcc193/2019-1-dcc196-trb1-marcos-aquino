<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />


<div>
    <div>
        <h1 align="center">Listagem</h1>
    </div>
    <div>        
        <table class="table">
                <thead class="thead-dark">
            <tr>
                <th>Sede</th>
                <th>Total</th>
            </tr>
            <c:forEach items="${relatorio}" var="rep">
                <tr>
                    <td>${rep.getNome_fantasia()}</td>
                    <td>${rep.totalHoras()}</td>
                </tr>
            </c:forEach>
        </table>
    </div>

    <img src="/img/banner.jpg" class="img-fluid" alt="Imagem responsiva">

</div>

<c:import url="/WEB-INF/views/rodape.jsp" />