package beginning.tdd.sample.legacy.magazine;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class NoMatchTitle implements TitleMaker {
	private static final Log LOG = LogFactory.getLog(NoMatchTitle.class);

	@Override
	public String make(Magazine magazine) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("No matched ComponentCreateType");
		}

		return StringUtils.EMPTY;
	}
}
