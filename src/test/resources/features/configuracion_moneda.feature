# language: es
Característica: verificar si la configuración de moneda persiste al cambiar de pagina y regresar
  Yo como comprador
  Quiero configurar mi elección de moneda y que se guarde
  Para posteriormente comprar en la moneda de mi elección

  Escenario: verificar si la configuración de moneda persiste al cambiar de pagina y regresar
    Cuando Juan cambia la configuracion de moneda a "COP"
    Entonces debe verse la configuracion de moneda "COP"
