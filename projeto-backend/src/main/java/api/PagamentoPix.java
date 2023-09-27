package api;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class PagamentoPix {

	MercadoPagoConfig.setAccessToken("TEST-4948667905090839-092613-d778e3242a77f14135b55f2bedf93a9c-1486479689");

	PaymentClient client = new PaymentClient();

	PaymentCreateRequest paymentCreateRequest =
	   PaymentCreateRequest.builder()
	       .transactionAmount(new BigDecimal("100"))
	       .description("Título do produto")
	       .paymentMethodId("pix")
	       .dateOfExpiration(OffsetDateTime.of(2023, 1, 10, 10, 10, 10, 0, ZoneOffset.UTC))
	       .payer(
	           PaymentPayerRequest.builder()
	               .email("PAYER_EMAIL")
	               .firstName("Test")
	               .identification(
	                   IdentificationRequest.builder().type("CPF").number("19119119100").build())
	               .build())
	       .build();

	client.create(paymentCreateRequest);

	
}
