package br.com.fiap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/music")
public class MusicController {

    @GetMapping
    public String letra() {
        return "<html>" +
                "<head>" +
                "  <style>" +
                "    body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #1a1a2e; color: #e0e0e0; padding: 40px; text-align: center; }" +
                "    .container { max-width: 600px; margin: 0 auto; background: #16213e; padding: 30px; border-radius: 12px; box-shadow: 0 8px 16px rgba(0,0,0,0.4); border: 1px solid #0f3460; }" +
                "    h1 { color: #f2a900; margin-bottom: 20px; font-size: 28px; }" +
                "    h2 { color: #e94560; margin-bottom: 25px; font-size: 18px; font-weight: normal; }" +
                "    p { line-height: 1.8; font-size: 16px; margin: 12px 0; color: #dcdde1; }" +
                "  </style>" +
                "</head>" +
                "<body>" +
                "  <div class='container'>" +
                "    <h1>Vejo Enfim a Luz Brilhar</h1>" +
                "    <h2>Enrolados (Tangled)</h2>" +
                "    <p>E há tanto tempo lidando com o nevoeiro<br>" +
                "    E há tanto tempo sem ver as coisas como são<br>" +
                "    E aqui estou eu, sob as estrelas<br>" +
                "    E de repente, veja só, tudo parece tão claro</p>" +
                "    <p>Vejo enfim a luz brilhar<br>" +
                "    Já passou a névoa<br>" +
                "    Vejo enfim a luz brilhar<br>" +
                "    Para o céu subir<br>" +
                "    E é tão bom ver o mundo assim<br>" +
                "    Tudo mudou, que bom<br>" +
                "    Agora eu vejo você</p>" +
                "  </div>" +
                "</body>" +
                "</html>";
    }
}