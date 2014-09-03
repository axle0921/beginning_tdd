package beginning.tdd.sample.legacy.magazine;

import org.apache.commons.lang.StringUtils;

public class GeneralMagazine {
	public String makeTitle(Magazine magazine) throws Exception {
		StringBuffer result = new StringBuffer();

		if (StringUtils.equals(magazine.getCategory(), "애완")) {
			if (magazine.getRanking() == 1) {
				result.append("[최고의 애완 잡지]");
			} else if (magazine.getRanking() <= 10) {
				result.append("[인기있는 애완 잡지]");
			} else if (magazine.getRanking() <= 30) {
				result.append("[볼만한 애완 잡지]");
			} else {
				result.append("[애완 잡지]");
			}
		} else if (StringUtils.equals(magazine.getCategory(), "예술")) {
			if (magazine.getRanking() == 1) {
				result.append("[최고의 예술 잡지]");
			} else if (magazine.getRanking() <= 10) {
				result.append("[인기있는 예술 잡지]");
			} else if (magazine.getRanking() <= 30) {
				result.append("[볼만한 예술 잡지]");
			} else {
				result.append("[예술 잡지]");
			}
		} else if (StringUtils.equals(magazine.getCategory(), "자동차")) {
			if (magazine.getRanking() == 1) {
				result.append("[최고의 자동차 잡지]");
			} else if (magazine.getRanking() <= 10) {
				result.append("[인기있는 자동차 잡지]");
			} else if (magazine.getRanking() <= 30) {
				result.append("[볼만한 자동차 잡지]");
			} else {
				result.append("[자동차 잡지]");
			}
		} else if (StringUtils.equals(magazine.getCategory(), "컴퓨터")) {
			if (magazine.getRanking() == 1) {
				result.append("[최고의 컴퓨터 잡지]");
			} else if (magazine.getRanking() <= 10) {
				result.append("[인기있는 컴퓨터 잡지]");
			} else if (magazine.getRanking() <= 30) {
				result.append("[볼만한 컴퓨터 잡지]");
			} else {
				result.append("[컴퓨터 잡지]");
			}
		} else if (StringUtils.equals(magazine.getCategory(), "스포츠")) {
			if (magazine.getRanking() == 1) {
				result.append("[최고의 스포츠 잡지]");
			} else if (magazine.getRanking() <= 10) {
				result.append("[인기있는 스포츠 잡지]");
			} else if (magazine.getRanking() <= 30) {
				result.append("[볼만한 스포츠 잡지]");
			} else {
				result.append("[스포츠 잡지]");
			}
		}

		result.append(magazine.getName());

		return result.toString();
	}
}
