# language: es
Característica: verificar el precio de un producto luego de hacer un filtro
  Yo como comprador
  Quiero filtrar elementos por precio
  Para posteriormente comprar

  Escenario: verificar el precio de unos crocs luego de hacer un filtro
    Cuando busco "crocs mens" y filtro los precios entre 0 y 25
    Entonces debe verse un precio entre 0 y 25 en el producto
