## Estructura del Projecte

L'aplicació segueix el patró **MVC** i està dividida en tres components principals:

### 1. **Model (Model)**
   - **Tiquet**: Representa un tiquet de compra, incloent la data, els productes comprats i el total.
   - **Productes**: És una classe abstracta per als diferents tipus de productes (alimentació, tèxtil i electrònica).
   - **Alimentacio, Electronica, Textil**: Classes que representen tipus específics de productes, cadascun amb la seva pròpia lògica (per exemple, càlcul de preus ajustats en funció de la caducitat o la garantia).
   - **RegistreTiquet**: Permet gestionar els tiquets i mostrar-los.
   -**Model**: Classe on gestionem totes les llistes o maps del projecte

### 2. **Vista (Vista)**
   - La vista gestiona la interfície amb l'usuari (UI). Els mètodes de la classe `Vista` mostren menús i opcions interactives a la consola perquè l'usuari triï què fer amb els productes i tiquets.

### 3. **Controlador (Controlador)**
   - La classe `Controlador` gestiona la interacció entre la vista i el model. A través de diferents menús, els usuaris poden afegir productes, crear tiquets i gestionar l'emmagatzematge de productes.

### Excepcions

- **LimitProductesException**: Es llança quan el nombre de productes arriba al límit establert.
- **NegatiuException**: Es llança si la garantia o la caducitat d'un producte és negativa o no vàlida.
- **DataCaducitatException**:Es llança si la data de caducitat d'un producte alimentari és anterior a la data actual.
- **NegatiuException**: ES llança si un valor introduit esta en negatiu, i el necesitem en positiu. (Un preu per exemple)

### Llistes

- **Magatzem**: He utilitzat un **LinkedList** per emmagatzemar els productes afegits, permetent que la llista creixi dinàmicament i s'hi puguin afegir o eliminar elements eficientment. Com podem tenir productes repetits, una LinkedList ens ve perfecte per crear el magatzem
- **Detalls de Productes**: He utilitzat un **HashMap** per gestionar les quantitats de productes per tipus i nom. El HashMap permet emmagatzemar parelles de clau-valor
- **Ordenació**: Per a l'ordenació de productes segons propietats específiques, com la data de caducitat o la composició, he utilitzat les utilitats de **Collections** amb el mètode `sort()`, facilitant la manipulació de les dades i la seva presentació.
