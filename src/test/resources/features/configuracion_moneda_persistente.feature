# language: es
Característica: verificar si la configuración de moneda persiste al cambiar de pagina y regresar
  Yo como comprador
  Quiero configurar mi elección de moneda y que se guarde
  Para posteriormente comprar en la moneda de mi elección

  Escenario: verificar si la configuración de moneda persiste al cambiar de pagina y regresar
    Dado que Juan cambia la configuracion de moneda a "COP"
    Cuando va a la pagina "https://google.com" y regresa a la pagina de amazon
    Entonces debe verse la configuracion de moneda "COP"
