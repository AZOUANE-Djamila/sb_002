package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.ConsultationRepository;

@Service
public class ConsultationService {
	
	@Autowired
	ConsultationRepository consultationRepository
}
