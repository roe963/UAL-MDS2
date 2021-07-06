import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaEncargadodecompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; justify-content: space-around; border: 1px solid black; padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-m);" id="layout-encargadoCompras">
 <label id="label-encargadoCompras" style="flex-grow: 0; width: 90%; flex-shrink: 0;">Label</label>
 <vaadin-checkbox id="checkbox-activarEncargadoCompras" style="width: 10%; flex-shrink: 0;">
  <iron-icon icon="lumo:eye" style="vertical-align: top;"></iron-icon>
 </vaadin-checkbox>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-encargadodecompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargadodecompras.is, VistaEncargadodecompras);
