package in.ashokit.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.QuoteResponse;

@Service
public class QuoteClientService 
{
	public QuoteResponse invokeRandonQuoteApi()
	{
		RestTemplate rt = new RestTemplate();
		String url ="https://quoters.apps.pcfone.io/api/random";
        ResponseEntity<QuoteResponse> entity = rt.getForEntity(url,QuoteResponse.class);
        QuoteResponse body = entity.getBody();

		
		return body;
	}

}
