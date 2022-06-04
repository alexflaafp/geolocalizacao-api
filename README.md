# geolocalizacao-api

# Considerações
   - A aplicação está configurada para rodar na porta 8099.
   - A aplicação foi desenvolvida utilizando Spring Boot. Este é um aplicativo autônomo onde tudo que você precisa está embutido.
   - Foi utilizada a API do Google Maps para obter a geolocalização (directions) criando uma rota, contendo uma ***origem*** e um ***destino*** como parâmetro.

### Para visualizar o código Java
   - Clone o projeto do GitHub https://github.com/alexflaafp/geolocalizacao-api.git

### Para executar o aplicativo
   - java -jar geolocalizacao-api-1.0.0.jar

### Para testar os endpoints
  - Quando o aplicativo estiver em execução, abra um navegador de sua escolha ou utilize o postman:
    - Somente latitude e longitude como ***destino*** e ***origem***:
      - http://localhost:8099/v1/geolocalizacao?destino=-22.795896336641512,-43.198931982933686&origem=-22.803258699505523,-43.19535170838785
    - Latitude e longitude para o ***destino*** e **endereço** para a ***origem***:  
      - http://localhost:8099/v1/geolocalizacao?destino=-22.795896336641512,%20-43.198931982933686&origem=Estrada da Cacuia, 226

# Parâmetros Obrigatórios
   - **destino**: O código (ID) do local, endereço ou valor textual de latitude/longitude para o qual você deseja calcular as rotas. As opções para o parâmetro de destino são as mesmas do parâmetro de origem.
   - **origem**: O código (ID) do local, endereço ou valor textual de latitude/longitude a partir do qual você deseja calcular as rotas.

# Endpoints Existentes na API
  1. Obter rota: 
      - Utilizando latitude/longitude: **[GET]** `http://localhost:8099/v1/geolocalizacao?destino=latitude,longitude&origem=latitude,longitude`
      - Utilizando latitude/longitude e endereco: **[GET]** `http://localhost:8099/v1/geolocalizacao?destino=latitude,longitude&origem=endereco`
  > NOTA: O valor dos parâmetros **código (ID) do local, endereço ou valor textual de latitude/longitude** podem ser inseridos tanto para o parâmetro ***destino*** quanto para ***origem***, não tendo nenhum tipo de restrição quanto a ordem de utilização do valor dos parâmetros.

# Tecnologias Utilizadas
  - Google Maps API
  - Java 8.x
  - Maven 3.x
  - Spring Framework 5.x
  - Spring Boot 2.6.0
  - Project Lombok
