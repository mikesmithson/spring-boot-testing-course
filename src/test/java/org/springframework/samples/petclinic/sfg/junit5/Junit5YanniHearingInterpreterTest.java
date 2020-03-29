package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.sfg.BaseConfig;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.samples.petclinic.sfg.YanniConfig;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

@SpringJUnitConfig(classes = { BaseConfig.class, YanniConfig.class })
public class Junit5YanniHearingInterpreterTest {
	@Autowired
	HearingInterpreter hearingInterpreter;

	@Test
	public void whatIHeard() {
		  assertThat(hearingInterpreter.whatIheard()).isEqualTo("Yanni");
	}
}
