package beginning.tdd.sample.legacy.magazine;

import org.apache.commons.lang.StringUtils;

public enum MagazineType {
	PET(PetTitle.class) {
		@Override
		boolean match(Magazine magazine) {
			return StringUtils.equals(magazine.getCategory(), "애완");
		}
	},
	ART(ArtTitle.class) {
		@Override
		boolean match(Magazine magazine) {
			return StringUtils.equals(magazine.getCategory(), "예술");
		}
	},
	CAR(CarTitle.class) {
		@Override
		boolean match(Magazine magazine) {
			return StringUtils.equals(magazine.getCategory(), "자동차");
		}
	},
	COMPUTER(ComputerTitle.class) {
		@Override
		boolean match(Magazine magazine) {
			return StringUtils.equals(magazine.getCategory(), "컴퓨터");
		}
	},
	SPORTS(SportsTitle.class) {
		@Override
		boolean match(Magazine magazine) {
			return StringUtils.equals(magazine.getCategory(), "스포츠");
		}
	},
	NO_MATCH(NoMatchTitle.class) {
		@Override
		boolean match(Magazine magazine) {
			return true;
		}
	};

	abstract boolean match(Magazine magazine);

	private Class<? extends TitleMaker> titleMaker;

	private MagazineType(Class<? extends TitleMaker> titleMaker) {
		this.titleMaker = titleMaker;
	}

	public Class<? extends TitleMaker> getMakerClass() {
		return titleMaker;
	}

	public static MagazineType makeTitleOf(Magazine magazine) {
		for (MagazineType each : MagazineType.values()) {
			if (isCreation(each) && each.match(magazine)) {
				return each;
			}
		}

		return NO_MATCH;
	}

	private static boolean isCreation(MagazineType each) {
		return each != NO_MATCH;
	}
}
