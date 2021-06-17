import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-respuestas.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaVerrespuestas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="layout-menu"></vaadin-vertical-layout>
 <h4 style="margin: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xs);">Contacto</h4>
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xs); align-self: stretch; margin-top: var(--lumo-space-xs);">
  <h4 style="flex-grow: 1;">Bandeja de entrada</h4>
  <vaadin-button id="button-responder" style="align-self: center;">
    Responder 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-xl); margin-top: var(--lumo-space-xs);">
  <vista-respuestas style="flex-grow: 1;"></vista-respuestas>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verrespuestas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerrespuestas.is, VistaVerrespuestas);
