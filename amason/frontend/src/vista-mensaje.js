import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaMensaje extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" id="vaadinHorizontalLayout" style="width: 100%; padding-left: var(--lumo-space-s); padding-right: var(--lumo-space-m); border: 1px solid black; justify-content: space-between;">
 <label id="label-usuario" style="flex-grow: 0; margin-right: var(--lumo-space-xl); width: 40%; align-self: center;">Usuario</label>
 <label id="label-mensaje" style="flex-grow: 0; width: 40%; align-self: center;">Mensaje</label>
 <vaadin-button id="button-vermensaje" style="width: 20%; align-self: center;">
   Ver 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-mensaje';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMensaje.is, VistaMensaje);
