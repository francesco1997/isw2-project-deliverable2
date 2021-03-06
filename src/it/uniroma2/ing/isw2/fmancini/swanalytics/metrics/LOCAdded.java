package it.uniroma2.ing.isw2.fmancini.swanalytics.metrics;

import org.eclipse.jgit.revwalk.RevCommit;

import it.uniroma2.ing.isw2.fmancini.swanalytics.git.DiffData;

/**
 * Measures the number of code lines added to a class
 * @author fmancini
 *
 */
public class LOCAdded extends RevisionMetric {

	
	public LOCAdded() {
		super();
	}
	
	private LOCAdded(LOCAdded source) {
		super(source);
	}
	
	@Override
	public void updateMeasurment(RevCommit commit, DiffData diff) {
		super.setMeasurment(super.getMeasurment() + diff.getAddedLines());
	}

	@Override
	public RevisionMetric duplicate() {
		return new LOCAdded(this);
	}

}
