import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';

class VistaProductoadministrado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; justify-content: space-between; border: 1px solid black; padding-right: var(--lumo-space-xs); padding-left: var(--lumo-space-m);" id="layout-producto">
 <label id="label-producto" style="flex-grow: 1; width: 90%;">Label</label>
 <vaadin-checkbox id="checkbox-activar" style="width: 10%;">
   🔏 
 </vaadin-checkbox>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-productoadministrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoadministrado.is, VistaProductoadministrado);
