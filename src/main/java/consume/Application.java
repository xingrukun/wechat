package consume;

import org.springframework.web.client.RestTemplate;

public class Application {
	
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		Page page = restTemplate.getForObject("http://localhost:8080/upload", Page.class);
		System.out.println(page.toString());
	}
	
}
