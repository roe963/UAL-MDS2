import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaEncargadocompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="layout-header" style="align-self: center;"></vaadin-vertical-layout>
 <vaadin-horizontal-layout style="align-self: stretch; margin-top: var(--lumo-space-m); justify-content: space-between;">
  <vaadin-vertical-layout theme="spacing" id="layout-pedidos-pendientes" style="flex-grow: 1; flex-shrink: 0; margin: var(--lumo-space-m);"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layout-pedidos-enviados" style="flex-grow: 1; flex-shrink: 0; margin: var(--lumo-space-m);"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-encargadocompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargadocompras.is, VistaEncargadocompras);
