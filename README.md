SAPAMERCAT - Álvaro Masedo
--------------------------

1. Primer de tot he creat una clase principal de Productes.
      a) Dins he creat els tres atributs comuns.
2. Després he creat una clase per cada tipus de producte (Aliments, tèxtil i electrònica).
      a) He afegit cada clase a la principal de Productes, perque com he dit, tenim atributs comuns a cada classe i així podem organitzar millor les classes.
      b) He creat constructors getters i setters.
3. A la clase Alimentació he fet la funció per calcular el preu segons la data de caducitat, igual que a electronica he creat la funció per calcular el preu segons els dies de garantía.
4. Com aquestes funcions han d'estar sempre presents a aquestes clases, he decidit ficar aquestes funcions dins de una interface anomenada CalcularData.
5. Per fer el menú principal he creat una funció amb souts a la clase vista. El controlador crida a aquesta clase i funció.
6. He utilitzat el switch i case per navegar per el menú.
