package com.unifacisa.tap.homebroker.service.scheduling;

import com.unifacisa.tap.homebroker.service.AcaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class ProgrammaticallyScheduledTasks {

    @Autowired
    private AcaoService acaoService;
    private static final Logger logger = LoggerFactory.getLogger(ProgrammaticallyScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 18000000)
    public void start() {
        logger.info("iniciando busca das ações");
        acaoService.salvarAcao();
        logger.info("ações salvas na base");
    }
}
