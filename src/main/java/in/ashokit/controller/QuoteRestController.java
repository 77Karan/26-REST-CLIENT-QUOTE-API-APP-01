package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.QuoteResponse;
import in.ashokit.client.QuoteClientService;

@RestController
public class QuoteRestController
{
	@Autowired
	private QuoteClientService quoteClientService;
	@GetMapping("/quote")
	public QuoteResponse getRandonQoute()
	{
		return quoteClientService.invokeRandonQuoteApi();
	}

}
