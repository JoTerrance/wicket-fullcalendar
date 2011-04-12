package net.ftlines.web.fullcalendar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.codehaus.jackson.annotate.JsonRawValue;

public class Config implements Serializable {
	private List<EventSource> eventSources = new ArrayList<EventSource>();
	private Header header = new Header();
	private String loading;
	private Boolean editable;
	private String eventDrop;
	private String eventResize;
	private Boolean selectable;
	private Boolean selectHelper;

	/** A callback that will fire after a selection is made */
	private String select;

	public Config add(EventSource eventSource) {
		eventSources.add(eventSource);
		return this;
	}

	public Collection<EventSource> getEventSources() {
		return Collections.unmodifiableList(eventSources);
	}

	public Header getHeader() {
		return header;
	}

	@JsonRawValue
	public String getEventResize() {
		return eventResize;
	}

	public void setEventResize(String eventResize) {
		this.eventResize = eventResize;
	}

	
	@JsonRawValue
	public String getLoading() {
		return loading;
	}

	public void setLoading(String loading) {
		this.loading = loading;
	}

	public Boolean isEditable() {
		return editable;
	}

	public void setEditable(Boolean editable) {
		this.editable = editable;
	}

	@JsonRawValue
	public String getEventDrop() {
		return eventDrop;
	}

	public void setEventDrop(String eventDrop) {
		this.eventDrop = eventDrop;
	}

	public Boolean isSelectable() {
		return selectable;
	}

	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}

	public Boolean isSelectHelper() {
		return selectHelper;
	}

	public void setSelectHelper(Boolean selectHelper) {
		this.selectHelper = selectHelper;
	}

	@JsonRawValue
	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	
}
