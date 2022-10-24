function CargarPacientes() {
  const options = { method: "GET" };

  fetch("http://localhost:8080/usuario/pacientes/2", options)
    .then((response) => response.json())
    .then((response) => {
      let pacientes = response;
      let registros = "";
      let nregistro = 0;
      for (const key in pacientes) {
        if (Object.hasOwnProperty.call(pacientes, key)) {
          nregistro++;
          //const element = pacientes[key];
          if (nregistro % 2 == 1) {
            registros += `<tr class="table-light">
                <th scope="row">${nregistro}</th>
                <td>${pacientes[key].idusuarios}</td>
                <td>${pacientes[key].primer_nombre}</td>
                <td>${pacientes[key].segundo_nombre}</td>
                <td>${pacientes[key].primer_apellido}</td>
                <td>${pacientes[key].segundo_apellido}</td>
                <td>@${pacientes[key].correo}</td>
                <td><button onclick="Eliminar(${pacientes[key].idusuarios})" type="button" class="btn btn-danger">Eliminar</button></td>
                <td><button onclick="Buscar(${pacientes[key].idusuarios})" type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#editarPaciente">
                Editar 
                </button></td>
                </tr>`;
          } else {
            registros += `<tr>
                <th scope="row">${nregistro}</th>
                <td>${pacientes[key].idusuarios}</td>
                <td>${pacientes[key].primer_nombre}</td>
                <td>${pacientes[key].segundo_nombre}</td>
                <td>${pacientes[key].primer_apellido}</td>
                <td>${pacientes[key].segundo_apellido}</td>
                <td>@${pacientes[key].correo}</td>
                <td><button onclick="Eliminar(${pacientes[key].idusuarios})" type="button" class="btn btn-danger">Eliminar</button></td>
                <td><button onclick="Buscar(${pacientes[key].idusuarios})" type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#editarPaciente">
                Editar 
                </button></td>
                </tr>`;
          }
        }
      }
      document.getElementById("Tablecuerpo").innerHTML = registros;
      console.log(4 % 2);
    })
    .catch((err) => console.error(err));
}

function Eliminar(id) {
  alert("Esta seguro de eliminiar?");
  const options = { method: "DELETE" };

  fetch("http://localhost:8080/usuario/pacientes/" + id, options)
    .then((response) => response.json())
    .then((response) => {
      CargarPacientes();
      console.log(response);
    })
    .catch((err) => console.error(err));
}

function guardarPacientes() {
  let identificacion = document.getElementById("Identificacion").value;
  let primer_nombre = document.getElementById("primer_nombre").value;
  let segundo_nombre = document.getElementById("segundo_nombre").value;
  let primer_apellido = document.getElementById("primer_apellido").value;
  let segundo_apellido = document.getElementById("segundo_apellido").value;
  let correo = document.getElementById("correo").value;
  let paciente = {
    identificacion: identificacion,
    primer_nombre: primer_nombre,
    segundo_nombre: segundo_nombre,
    primer_apellido: primer_apellido,
    segundo_apellido: segundo_apellido,
    correo: correo,
    rol: 2,
    estado: 1,
  };

  const options = {
    method: "POST",
    headers: { "Content-Type": "application/json", charset: "utf-8" },
    body: JSON.stringify(paciente),
    //body: `{"identificacion":${identificacion},"primer_nombre":${primer_nombre},"segundo_nombre":${segundo_nombre},"primer_apellido":${primer_apellido},"segundo_apellido":${segundo_apellido},"correo":${correo},"rol":2,"estado":1}`
  };

  fetch("http://localhost:8080/usuario/save", options)
    .then((response) => response.json())
    .then((response) => {
      CargarPacientes();
      console.log(response);
    })
    .catch((err) => console.error(err));
}


function actualizarPacientes() {
    let ide = document.getElementById("IdEd").value;
    let identificacion = document.getElementById("IdentificacionEd").value;
    let primer_nombre = document.getElementById("primer_nombreEd").value;
    let segundo_nombre = document.getElementById("segundo_nombreEd").value;
    let primer_apellido = document.getElementById("primer_apellidoEd").value;
    let segundo_apellido = document.getElementById("segundo_apellidoEd").value;
    let correo = document.getElementById("correoEd").value;
    let paciente = {
      idusuarios:ide,
      identificacion: identificacion,
      primer_nombre: primer_nombre,
      segundo_nombre: segundo_nombre,
      primer_apellido: primer_apellido,
      segundo_apellido: segundo_apellido,
      correo: correo,
      rol: 2,
      estado: 1,
    };
  
    const options = {
      method: "POST",
      headers: { "Content-Type": "application/json", charset: "utf-8" },
      body: JSON.stringify(paciente),
      //body: `{"identificacion":${identificacion},"primer_nombre":${primer_nombre},"segundo_nombre":${segundo_nombre},"primer_apellido":${primer_apellido},"segundo_apellido":${segundo_apellido},"correo":${correo},"rol":2,"estado":1}`
    };
  
    fetch("http://localhost:8080/usuario/save", options)
      .then((response) => response.json())
      .then((response) => {
        CargarPacientes();
        console.log(response);
      })
      .catch((err) => console.error(err));
  }


function Buscar(id) {
  const options = { method: "GET" };

  fetch("http://localhost:8080/usuario/" + id, options)
    .then((response) => response.json())
    .then((response) => {
      document.getElementById("IdEd").value=response.idusuarios;
      document.getElementById("IdentificacionEd").value=response.identificacion;
      document.getElementById("primer_nombreEd").value=response.primer_nombre;
      document.getElementById("segundo_nombreEd").value=response.segundo_nombre;
      document.getElementById("primer_apellidoEd").value=response.primer_apellido;
      document.getElementById("segundo_apellidoEd").value=response.segundo_apellido;
      document.getElementById("correoEd").value=response.correo;
      
    })
    .catch((err) => console.error(err));
}
//}
