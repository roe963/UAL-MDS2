import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-verrespuestas`
 *
 * VistaVerrespuestas element.
 *
 * @customElement
 * @polymer
 */
class VistaVerrespuestas extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
