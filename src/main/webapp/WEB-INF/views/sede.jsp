<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div>
    <div>
        <h1>Sedes</h1>
    </div>

    <p class="lead">
            Confira a listagem de nossas sedes espalhadas pelo estado de Minas Gerais
        </p>

    <div>
        <a class="btn btn-primary btn-sm" href="form_sede.html" role="button">Nova</a><br /><br />

        <table class="table">
        <thead class="thead-dark">
            <tr>

                <th>Nome</th>
                <th>Site</th>
                <th>Cidade</th>
                <th>Bairro</th>
                <th>Estado</th>
                <th>Telefone</th>
                <th>Total</th>
                <th>Ações</th>
            </tr>

            <c:forEach items="${sede}" var="rep">
                <tr>

                    <td>${rep.getNome_fantasia()}</td>
                    <td>${rep.getEndereco()}</td>
                    <td>${rep.getCidade()}</td>
                    <td>${rep.getBairro()}</td>
                    <td>${rep.getEstado()}</td>
                    <td>${rep.getTelefone()}</td>
                    <td>${rep.totalHoras()}</td>
                    <td>
                        <div class="row">
                            <form method="POST" action="edt_sede.html">
                                <input type="hidden" name="id" value="${rep.getId()}">
                                <button type="submit" class="btn btn-outline-primary">Editar</button>
                            </form>
                            <form method="POST" action="sede_excluir.html">
                                <input type="hidden" name="id" value="${rep.getId()}">
                                <button type="submit" class="btn btn-outline-danger">Excluir</i></button>
                            </form>
                        </div>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </div>

    <img src="/img/banner.jpg" class="img-fluid" alt="Imagem responsiva">

</div>

<c:import url="/WEB-INF/views/rodape.jsp" />