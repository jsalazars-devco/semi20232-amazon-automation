# language: es
Característica: cambiar la ubicación de envío mediante un código postal
  Yo como comprador
  Quiero cambiar la ubicación de envío mediante un código postal
  Para posteriormente recibir mis items en dicho lugar

  Esquema del escenario: cambiar la ubicacion de envio mediante un código postal
    Cuando Juan cambia la ubicacion con el codigo postal "<codigo postal>"
    Entonces debe verse la ubicacion en "<ciudad>"
    Ejemplos:
      | codigo postal | ciudad      |
      | 10001         | New York    |
      | 90001         | Los Angeles |
      | 50001         | Ackworth    |

