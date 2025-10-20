package io.intino.compiler;

import io.intino.tara.builder.Tarac;
import io.intino.tara.builder.TaracRunner;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

@Ignore
public class AcceptedTaraRunnersTest {
	private String home;

	private static String temp(String filepath) {
		try {
			File file = new File(filepath);
			String home = System.getProperty("user.home");
			String text = Files.readString(file.toPath()).replace("$WORKSPACE", home + File.separator + "workspace").replace("$HOME", home);
			Path temporalFile = Files.createTempFile(file.getName(), ".txt");
			Files.writeString(temporalFile, text, StandardOpenOption.TRUNCATE_EXISTING);
			temporalFile.toFile().deleteOnExit();
			return temporalFile.toFile().getAbsolutePath();
		} catch (IOException e) {
			return null;
		}
	}

	@Before
	public void setUp() {
		home = new File("test-res").getAbsolutePath() + File.separator;
	}

	@Test
	public void exampleM2Run() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/m2.txt")});
	}

	@Test
	public void legioM2Run() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/legio.txt")});
	}

	@Test
	public void konosM2Run() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/konos.txt")});
	}

	@Test
	public void visoraM2Run() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/visora-m2.txt")});
	}

	@Test
	public void visoraM1Run() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/visora-m1.txt")});
	}

	@Test
	public void picotaM2() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/picota-m2.txt")});
	}

	@Test
	public void semanticM2() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/semantic-m2.txt")});
	}

	@Test
	public void picotaM1() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/picota-m1.txt")});
	}

	@Test
	public void semanticM1() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/semantic-m1.txt")});
	}

	@Test
	public void tafatM2Run() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/tafat-m2.txt")});
	}

	@Test
	public void tafatM1Run() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/tafat-m1.txt")});
	}

	@Test
	public void legioM1Run() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/legio-m1.txt")});
	}

	@Test
	public void konosM1Run() {
		TaracRunner.main(new String[]{temp(home + "sandbox/confFiles/example/konos-m1.txt")});
	}

	@Test
	public void exampleM2() {
		Tarac.main(new String[]{
				"--level 2",
				"--dsl Proteo:1.0.0",
				"--out-dsl Research:1.0.0",
				"/Users/oroncal/workspace/sandbox/academic-research-dsl/dsl/research-metadsl.tara"});
	}
}