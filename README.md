# Sellers Transfer Bigdata
Componente focado em transferir dados entre microservices pelo Redis.

![Sellers](https://img.shields.io/badge/project-%20Sellers%20Developer%20Community%20-orange) <br>
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

## Problema a ser resolvido
Quando se usa a cominicação por mensageria, muita vezes enfrentamos o problema de os dados que vão pra fila são dados grandes.
Enviar dados grandes pode ter vários problemas de performance.

## Solução
Vamos gravar os dados no Redis e transferir pela mensagem somente a referência do objeto para ser recuperado.

Cenários:


## Como utililzar
1. Adicionar dependência

```
     <dependency>
            <groupId>com.github.Sellers-Community</groupId>
            <artifactId>sellers-transfer-bigdata</artifactId>
            <version>v1.0.0-3</version>
        </dependency>
```

2. Habilitando 

```
@EnabledSellersTransferBigdata
```

3. Anotação do cache
Adicionar nas classes de envio de dados pelo kafka pra adicionar um novo header nos envios.
Essa é uma chave personalizada que cada serviço pode gerar.
```
 record.headers().add(new RecordHeader(TransferBigdataHeader.KEY_TRANSFER_BIGDATA_VALUE, keyTransferBigdata.getBytes()));
```

