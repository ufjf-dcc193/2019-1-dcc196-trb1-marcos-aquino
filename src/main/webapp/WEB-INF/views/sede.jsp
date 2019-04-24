<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/views/cabecalho.jsp" />

<div>
    <div>
        <h1 align="center">Sedes</h1>
    </div>
    <div>
        <a class="btn btn-primary btn-sm" href="form_sede.html" role="button"><i class="fa fa-plus"
                aria-hidden="true"></i>
        </a><br /><br />

        <table class="table">
            <tr>
                <!-- <th>ID</th> -->
                <th>Nome Fantasia</th>
                <th>Endereço</th>
                <th>Cidade</th>
                <th>Bairro</th>
                <th>Estado</th>
                <th>Telefone</th>
                <th>Total</th>
                <th>Ações</th>
            </tr>

            <c:forEach items="${sede}" var="rep">
                <tr>
                    <!-- <td>${rep.getId()}</td> -->
                    <td>${rep.getNome_fantasia()}</td>
                    <td>${rep.getEndereco()}</td>
                    <td>${rep.getCidade()}</td>
                    <td>${rep.getBairro()}</td>
                    <td>${rep.getEstado()}</td>
                    <td>${rep.getTelefone()}</td>
                    <td>${rep.totalHoras()} <i class="far fa-clock"></i></td>
                    <td>
                        <div class="row">
                            <form method="POST" action="edt_sede.html">
                                <input type="hidden" name="id" value="${rep.getId()}">
                                <button type="submit" class="btn btn-info btn-sm"><i class="far fa-edit"></i></button>
                            </form>
                            <form method="POST" action="sede_excluir.html">
                                <input type="hidden" name="id" value="${rep.getId()}">
                                <button type="submit" class="btn btn-danger btn-sm"><i class="far fa-trash-alt"></i></button>
                            </form>
                        </div>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </div>

</div>

<c:import url="/WEB-INF/views/rodape.jsp" />